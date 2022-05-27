
const fakeRequestCallBack = (url, success, failure) => {
    const delay = Math.floor(Math.random() * 4500) + 500;
    setTimeout(() => {
        if (delay > 4000) {
            failure('Connection Timeout :(');
        }
        else {
            success(`Here is your fake data from ${url}`);
        }

    }, delay)
}

const fakeRequestPromise = (url) => {
    return new Promise((resolve, reject) => {
        const delay = Math.floor(Math.random() * (4500)) + 500;
        setTimeout(() => {
            if (delay > 4000) {
                reject('Connection Timeout :(');
            } else {
                resolve(`Here is your fake data from ${url}`);
            }
        }, delay)
    })
}

// fakeRequestCallBack('books.com/page1',
//     function (response) {
//         console.log("IT WORKED!!!");
//         console.log(response);
//         fakeRequestCallBack('books.com/page2',
//             function (response) {
//                 console.log("It worked again!! ");
//                 console.log(response);
//                 fakeRequestCallBack('books.com/page3',
//                     function (response) {
//                         console.log("It worked again (3rd req) !!!");
//                         console.log(response);
//                     },
//                     function (err) {
//                         console.log("ERROR (3rd req)!!!", err)
//                     })
//             },
//             function (err) {
//                 console.log("ERROR (2nd req)!!!", err);
//             })
//     }, function (err) {
//         console.log("ERROR!!!", err);
//     })

const request = fakeRequestPromise('yelp.com/api/coffee/page1');

// request
//     .then(() => {
//         console.log("Promise resolved!");
//         console.log("It worked!!! (page1)");
//         fakeRequestPromise('yelp.com/api/coffee/page2')
//             .then(() => {
//                 console.log("It worked!!! (page2)");
//                 fakeRequestPromise ('yelp.com/api/coffee/page3')
//                 .then (() => {
//                     console.log("It worked!! (page3)");
//                 })
//                 .catch ( () => {
//                     console.log("Oh no, error!! (page3)");
//                 })
//             })
//             .catch (() => {
//                 console.log("Oh no, error!!! (page2)");
//             }) 
//     })
//     .catch(() => {
//         console.log("Oh no, error! (page1)");
//     })

fakeRequestPromise ('yelp.com/api/coffee/page1')
    .then ( (data) => {
        console.log("It worked!!! (page1) ");
        console.log(data);
        return fakeRequestPromise ('yelp.com/api/coffee/page2');
    })
    .then ( (data) => {
        console.log("It worked!!! (page2) ");
        return fakeRequestPromise ('yelp.com/api/coffee/page2');
    })
    .then ( () => {
        console.log("It worked!!! (page3) ");
        return fakeRequestPromise ('yelp.com/api/coffee/page2');
    })
    .catch ( () => {
        console.log("Oh no, a request failed!!! ");
    })
    
