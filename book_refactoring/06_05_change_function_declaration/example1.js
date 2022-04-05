// 변경 전
// deprecated 추가
// 사용하지 않는 시점에 삭제
function circum(radius) {
    return circumference(radius);
}

// 변경 후
function circumference(radius) {
    return 2 * Math.PI * radius;
}