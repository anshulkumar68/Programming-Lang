// Count occurrences of each character in a string
function charOccurence(){
    let str = 'Radhe radhe'.toLowerCase()
    let count = {}
    for(let char of str){
        if(count[char]) count[char] = count[char] + 1;
        else count[char] = 1;
    }
    return count;
} 
// console.log(charOccurence());

