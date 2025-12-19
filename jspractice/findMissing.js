// Find missing number in an array from 1 to N
function findMissing(){
    let arr = [1, 2, 3, 4, 5, 6, 7, 9, 10];
    for(let i=0; i<arr.length-1; i++){
        if(arr[i]+1!==arr[i+1]) return arr[i]+1
    } 
    return null
}
console.log(findMissing())