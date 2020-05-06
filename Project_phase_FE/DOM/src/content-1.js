// 1)  Fill every paragraph with the last one's content.(innerHTML)
let classNames = ["apple", "balloon", "cat", "animals"];
let variables = [];
for(let i = 0; i < classNames.length; i++){
    let currentVariable = document.getElementsByClassName(classNames[i]);
    if (currentVariable[0] != null){
        variables[i] = currentVariable[0];
    }
}

let getContent = variables[variables.length - 1].innerHTML;
for (let i = 0; i < variables.length - 1; i++) {
    variables[i].innerHTML = getContent;
}

// 2)  Do the same again, but you should keep the cat strong.
