const divId = document.getElementById('container')

for (let number = 0; number < 100; number++) {
    const button = document.createElement('button');
    button.textContent = "brains";
    divId.appendChild (button);
}