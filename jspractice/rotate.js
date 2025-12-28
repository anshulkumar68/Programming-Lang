// Rotate an array by k positions.
function rotate(){
    let arr = [1, 2, 3, 4, 5 ,6, 7]
    let k =3;
    let res = [];
    for(let i=0; i<arr.length; i++){
        res[(i+k)%arr.length] = arr[i];
    }
    console.log(res);
}
rotate()