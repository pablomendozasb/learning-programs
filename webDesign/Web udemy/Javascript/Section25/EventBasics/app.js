const btn = document.querySelector ('#v2');

btn.onclick = function () {
    console.log("You clicked the second button");
    console.log("I hope it worked");
}

function scream () {
    console.log("BRAINS!!!");
    console.log("MORE BRAINS!!!");
}

btn.onmouseenter = scream;

document.querySelector ('h1').onclick =  () => {
    alert ('You clicked h1! ')
}

const btn3 = document.querySelector ('#v3');
btn3.addEventListener ('dblclick', function () {
   alert ("CLICKED!"); 
})

function twist () {
    console.log("TWIST");
}

function shout () {
    console.log("SHOUT!");
}

const tasButton = document.querySelector ('#tas');

tasButton.addEventListener ('click', twist, {once:true});
tasButton.addEventListener ('click', shout, {once: true}); 



