// Add an item that says 'The Green Fox' to the asteroid list.
let asteroids = document.getElementsByClassName("asteroids")[0];
let gf = document.createElement("li");
let GF = asteroids.appendChild(gf);
GF.innerHTML = "The Green Fox Academy"

//     Add an item that says 'The Lamplighter' to the asteroid list.
let newLi = document.createElement("li");
let lampLighter = asteroids.appendChild(newLi);
lampLighter.innerHTML = "The Lamplighter";

//     Add a heading saying 'I can add elements to the DOM!' to the .container.
let container = document.getElementsByClassName("container")[0];
let newElement = document.createElement("p");
let stringAdd = container.appendChild(newElement);
stringAdd.innerHTML = "I can add elements to the DOM!";

//     Add an image, any image, to the container.
let img = document.createElement("img");
let addImg = container.appendChild(img);
let setSrc = addImg.setAttribute("src", "https://www.google.com/search?q=picture&source=lnms&tbm=isch&sa=X&ved=2ahUKEwj-zKLUy53pAhXqiIsKHSEEAb8Q_AUoAXoECA0QAw&biw=1536&bih=674#imgrc=vqJV8dXCPHgD6M");
