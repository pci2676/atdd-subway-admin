const METHOD = {
    PUT(data) {
        return {
            method: "PUT",
            headers: {
                "Content-Type": "application/json; charset=UTF-8"
            },
            body: JSON.stringify(
                data
            )
        };
    },
    DELETE() {
        return {
            method: "DELETE"
        };
    },
    POST(data) {
        return {
            method: "POST",
            headers: {
                "Content-Type": "application/json; charset=UTF-8"
            },
            body: JSON.stringify(
                data
            )
        };
    }
};

const resolver = (response) => {
    return new Promise((resolve, reject) => {
        let func;
        response.status < 400 ? func = resolve : func = reject;

        response.json().then(data => func({'status': response.status, 'body': data}));
    });
}

const api = (() => {
    const request = (uri, config) => fetch(uri, config).then(resolver);

    const station = {
        get() {
            return request(`/stations`);
        },
        create(data) {
            return request(`/stations`, METHOD.POST(data));
        },
        update(data, id) {
            return request(`/station/${id}`, METHOD.PUT(data));
        },
        delete(id) {
            return request(`/station/${id}`, METHOD.DELETE);
        }
    };

    const line = {
        get() {
            return request(`/lines`);
        },
        findById(id) {
            return request(`/lines/${id}`);
        },
        create(data) {
            return request(`/lines`, METHOD.POST(data));
        },
        update(id, data) {
            return request(`/lines/${id}`, METHOD.PUT(data));
        },
        delete(id) {
            return request(`/lines/${id}`, METHOD.DELETE());
        }
    };

    return {
        station, line
    };
})();

export default api;
