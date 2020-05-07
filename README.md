# 미션 수행 순서

1. 인수 조건 파악하기
2. 인수 테스트 작성하기
3. 인수 테스트 성공 시키기
4. 기능 구현
5. API를 활용하여 페이지 연동하기

## 요구 사항

- 인수 테스트(LineAcceptanceTest) 성공 시키기
- LineController를 구현하고 인수 테스트에 맞는 기능을 구현하기
- 테스트의 중복을 제거하기

## 1. 기능 목록

- [x] 지하철 노선 추가 API

  - 노선 추가 요청 

    → 노선이 추가 된다.

- [x] 지하철 노선 목록 조회 API

  - 노선의 전체 목록을 조회한다.

    → 노선 전체 목록을 반환한다.

- [x] 지하철 노선 수정 API

  - 특정 노선의 수정을 요청한다.

    → 특정 노선을 수정한다.

- [x] 지하철 노선 단건 조회 API

  - 특정 노선을 조회한다.

    → 노선의 정보와 노선에 속한 역 정보를 반환한다.

- [x] 지하철 노선 제거 API

  - 특정 노선을 제거한다.

    → 해당 노선과 노선에 속한 역 정보를 제거한다.

## 프로그래밍 제약 사항

- 지하철 노선 이름은 중복될 수 없다.

## 미션 수행 순서

- [x] 인수 조건 파악하기 (제공)

- [x] 인수 테스트 작성하기 (제공)

- [x] 인수 테스트 성공 시키기

- [x] 기능 구현



## 2. 기능 목록

## 기능 목록

### 지하철 노선 관리 페이지

- [x] 페이지 호출 시 미리 저장한 지하철 노선 조회
- [x] 지하철 노선 목록 조회 API 사용

### 노선 추가

- [x] 노선 추가 버튼을 누르면 아래와 같은 팝업화면이 뜸
- [x] 노선 이름과 정보를 입력
- [x] 지하철 노선 추가 API 사용

### 노선 상세 정보 조회
- [x] 목록에서 노선 선택 시 상세 정보를 조회

### 노선 수정
- [x] 목록에서 우측 수정 버튼을 통해 수정 팝업화면 노출
- [x] 수정 팝업 노출 시 기존 정보는 입력되어 있어야 함
- [x] 정보 수정 후 지하철 노선 수정 API 사용

### 노선 삭제
- [ ] 목록에서 우측 삭제 버튼을 통해 삭제
- [ ] 지하철 노선 삭제 API 사용