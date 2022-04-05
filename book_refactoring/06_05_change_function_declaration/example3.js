// 변경 전
// function isNewEngland(aCustomer) {
//     return ["MA", "CT", "ME", "VT", "NG"].includes(aCustomer.address.state);
// }

// 1단계
function isNewEngland(aCustomer) {
    const stateCode = aCustomer.address.state;
    return ["MA", "CT", "ME", "VT", "NG"].includes(stateCode);
}

// 2단계 - 함수 추출하기
function isNewEngland(aCustomer) {
    const stateCode = aCustomer.address.state;
    return ["MA", "CT", "ME", "VT", "NG"].includes(stateCode);
}

function xxNewEngland(stateCode) {
    return ["MA", "CT", "ME", "VT", "NG"].includes(stateCode);
}

// 3단계 - 기존 함수 인라인으로 변경하기
function isNewEngland(aCustomer) {
    return xxNewEngland(aCustomer.address.state)
}

function xxNewEngland(stateCode) {
    return ["MA", "CT", "ME", "VT", "NG"].includes(stateCode);
}

// 4단계 - 기존 함수 호출문을 새 함수 호출문으로 변경

// 5단계 - 신규 함수 이름을 기존 함수 이름으로 변경
function isNewEngland(stateCode) {
    return ["MA", "CT", "ME", "VT", "NG"].includes(stateCode);
}