
// //const a = [21, 25, 29,22, 24,28,27, 26, 20];          // Last Number Missing 30  
// //const a = [21, 25, 29,22, 24,28,30,27, 26];         // First Number Missing 20
// const a = [21, 25, 29,22, 24,28,30,27, 26, 20];       // Middle Number Missing 23

// let start = 20;            // Sequence start number        
// let end = 30;              // Sequence end number


// console.log(getMissing_no(a, start, end));

// // getMissing_no function
// function getMissing_no(arr, start, end) {
//     arr = arr.sort();
//     var n = arr.length;


//     for (var i = 0; i < n; i++) {

//         let first_no = arr[i];

//         let next_no = arr[i + 1];

//         // Check first number missing
//         if (start == arr[0] - 1) {
//             return "First No " + start + " Missing"
//         }
//         // Return missing number
//         if (next_no - first_no == 2) {
//             let missingNo=arr[i]+1;
//             return "Missing No " +missingNo;
//         }

//         //Check last number missing
//         if (end == arr[arr.length - 1] + 1) {
//             return "Last No " + end + " Missing"
//         }


//     }

// }
console.log(find_max(30));

function find_max(nums) {
    let max_num = Number.NEGATIVE_INFINITY; // smaller than all other numbers
    for (let num of nums) {
        if (num > max_num) {
      
        }
    }
    return max_num;
}


