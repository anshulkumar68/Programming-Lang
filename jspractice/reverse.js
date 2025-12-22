//  Reverse a string 
function reverseString(str){
    // str = 'Radhe Krishna';
    let res = '';
    for(let i=str.length-1; i>=0; i--){
        res += str[i];
    }
    return res;
    // console.log(res);
    // console.log(str.split(' ').reverse().join(''))
    // split method convert the string into array if you pass space then wherever it found space it will split those part into array
}
// reverseString()

// Check if a string is palindrome
function checkStringPalindrome(){
    let str = 'noon moom'
    let rev = ''; 
    for(let i=str.length-1; i>=0; i--){
        rev += str[i];
    }
    // let rev = str.split('').reverse().join('')
    return rev === str
}
// console.log(checkStringPalindrome());

// Reverse words in a sentence
function revWordSentence(){
    let str = "Tomorrow i will do work from home";
    let words = str.split(' ')
    let result = []
    for(let value of words){
        result.push(value.split('').reverse().join(''))
    }
    console.log(result.join(' '))
}
// revWordSentence();

//reverse a array
function revArray(){
    let arr = [2, 62 , 18, 198, 38, 25];
    let s = 0, e = arr.length-1;
    while(s<=e){
        let temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        s++;
        e--;
    }
    console.log(arr)
}
revArray();