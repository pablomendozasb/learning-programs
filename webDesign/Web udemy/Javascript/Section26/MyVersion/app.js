
let h2 = document.querySelector ('h2');
let button1 = document.querySelector ('#playerOne');
let button2 = document.querySelector ('#playerTwo');
let resetButton = document.querySelector ('#reset');
let player1Points = 0;
let player2Points = 0;
let playerOneWord = document.getElementById ('playerOneWord');
let playerTwoWord = document.getElementById ('playerTwoWord');

button1.addEventListener ('click', function () {
    player1Points++;
    playerOneWord.innerText = player1Points;
    playerOneWord.style.color = '#0d6efd';

});

button2.addEventListener ('click', function () {
    player2Points++;
    playerTwoWord.innerText = player2Points;
    playerTwoWord.style.color = '#dc3545';
});



resetButton.addEventListener ('click', function () {
    player1Points = 0;
    player2Points = 0;
    playerOneWord.innerText = player1Points;
    playerTwoWord.innerText = player2Points;
    playerOneWord.style.color = 'black';
    playerTwoWord.style.color = 'black';
})



