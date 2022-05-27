
const colors = ['red', 'orange', 'yellow', 'green', 'blue', 'indigo', 'violet']; //PLEASE DON'T CHANGE THIS LINE!

//YOU CODE GOES HERE:
const tagSelection = document.querySelectorAll ('span');


for (let number = 0;number < tagSelection.length; number++) {
    console.log(number);
    tagSelection[number].style.color = colors[number];
}