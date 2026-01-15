// Find missing number in an array from 1 to N
function findMissing(){
    let arr = [1, 2, 3, 4, 5, 6, 7, 9, 10];
    for(let i=0; i<arr.length-1; i++){
        if(arr[i]+1!==arr[i+1]) return arr[i]+1
    } 
    return null
}
console.log(findMissing())

// find missing numbers in array
function findMissing(){
    let arr = [1, 7, 2, 3];
    let res = [];
    arr.sort((a,b)=>a-b)
    console.log(arr)
    for(let i=0; i<arr.length-1; i++){
        if(arr[i+1]!==arr[i]+1){
            console.log(arr[i]+1)
            res.push(arr[i]+1);
        }
    }
    console.log(res)
}
// findMissing()

// find missing sequential numbers in array
function findMissing() {
    let arr = [1, 5, 7, 2, 3];
    let res = [];

    arr.sort((a, b) => a - b);

    for (let i = 0; i < arr.length - 1; i++) {
        let current = arr[i];
        let next = arr[i + 1];

        while (current + 1 < next) {
            current++;
            res.push(current);
        }
    }

    console.log(res);
}

// findMissing(); 