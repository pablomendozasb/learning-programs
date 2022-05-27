
// const form = document.querySelector('form')
// const productContainer = document.querySelector ('#list');

// form.addEventListener ('submit', function (e) {
//     e.preventDefault ();  

//     const productInput = form.elements.product;
//     const quantityInput = form.elements.qty;

//     addProduct (productInput.value, quantityInput.value);
//     quantityInput.value = '';
//     productInput.value = '';
//   });

// const addProduct = (product,qty ) => {
//     const newProduct = document.createElement ('li');
//     newProduct.append(qty);
//     newProduct.append(" ");
//     newProduct.append (product);
//     productContainer.append (newProduct);
// }

const newForm = document.querySelector ('form');
const newProductContainer = document.querySelector ('#list');

newForm.addEventListener ('submit', function (e){
    e.preventDefault();

    
    const productInput = newForm.elements.product;
    const quantityInput = newForm.elements.qty;

    const newProduct = document.createElement ('li');
    const productText = document.createTextNode (`${productInput.value}`);
    const productNumber = document.createTextNode (`${quantityInput.value} `);
    newProduct.appendChild (productNumber);
    newProduct.appendChild (productText);
    newProductContainer.appendChild (newProduct);

    productInput.value = '';
    quantityInput.value = '';

});

