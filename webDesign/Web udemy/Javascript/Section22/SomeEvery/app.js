
const exams = [80,98,92,78,70,90,89,84,81,77];

exams.some (score => score >= 75)

const movies = [
    {
        title: 'Amadeus',
        score: 99,
        year: 1984
    },
    {
        title: 'Sharknado',
        score: 35,
        year: 2013
    },
    {
        title: '13 Going On 30',
        score: 70,
        year: 2004
    },
    {
        title: 'Stand By Me',
        score: 85,
        year: 1986
    },
    {
        title: 'Waterworld',
        score: 62,
        year: 1995
    },
    {
        title: 'Jingle All The Way',
        score: 71,
        year: 1996
    },
    {
        title: 'Parasite',
        score: 95,
        year: 2019
    },
    {
        title: 'Notting Hill',
        score: 77,
        year: 1999
    },
    {
        title: 'Alien',
        score: 90,
        year: 1979
    }
]

movies.some (movie => movie.year > 2015)

const array = [2,4,6,8];

const even = (element) => element % 2 === 0;

console.log(array.some(even));

function isBiggerThan10 (element, index, array) {
    return element > 10;
}

[2,5,8,1,4].some(isBiggerThan10);
[12,5,8,1,5].some(isBiggerThan10);

const fruits = ['apple', 'banana', 'mango', 'guava'];

function checkAvailability (arr, val) {
    return arr.some(function(arrVal) {
        return val == arrVal;
    }); 
}

const TRUTHY_VALUES = [true, 'true', 1];

function getBoolean(value) {

    'use strict';

    if(typeof value === 'string') {
        value = value.toLowerCase ().trim ();
    }

    return TRUTHY_VALUES.some(function(t){
        return t === value;
    });

}