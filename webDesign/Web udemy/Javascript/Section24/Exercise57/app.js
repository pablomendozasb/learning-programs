const liSelect = document.querySelectorAll('li');


for (let number = 0; number < liSelect.length; number++) {
    liSelect[number].classList.toggle ('highlight');
}