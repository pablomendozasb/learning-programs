
let scores = [1,2,3,4,5];

scores.push(6);

console.log(scores);


scores.splice(5,1);

console.log(scores);

let list = ['eggs','chocolate'];
let command = prompt ("Enter the command (new,quit,delete and list):");

while (command !== 'quit') {

    if (command.toLowerCase() === 'new') {
        let listProduct = prompt ("Enter the product you want to add:"); 
        console.log(listProduct + " was added.");
        list.push(listProduct);
    }
    
    else if (command.toLowerCase() === 'delete') {
        let number = prompt ("Enter the index number of the item you want to delete:");
        console.log(list[number]+ " was deleted.");
        list.splice(number, 1);
    }

    else if (command.toLowerCase() === 'list') {
        console.log("**********");
        for (let i = 0; i < list.length; i++) {
            console.log(i+": "+list[i]);
        }
        console.log("**********");
    }

    else {
        console.log("Please insert a correct command:");
    }

    command = prompt ("Enter the command: (new,quit,delete and list):");

}



console.log("The program is finished: ");