// 변경 전
// let tpHd = "untitle";
// let result = `<h1>${tpHd}</h1>`
// tpHd = obj["articleTitle"]

// 1단계 - 캡슐화
// let tpHd = "untitle";
// let result = `<h1>${title()}</h1>`
// setTitle(obj["articleTitle"])

// function title() { return tpHd; }
// function setTitle(arg) { tpHd = arg; }

// 2단계 - 이름 바꾸기
let _title = "untitle";
let result = `<h1>${title()}</h1>`
setTitle(obj["articleTitle"])

function title() { return _title; }
function setTitle(arg) { _title = arg; }