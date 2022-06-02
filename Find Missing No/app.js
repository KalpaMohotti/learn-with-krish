


const a = [21, 25, 29,22, 24,28, 27, 26, 30];  // Sequence
let start = 21;            // Sequence start number        
let end = 30;              // Sequence end number


console.log(getMissing_no(a, start, end));

// getMissing_no function
function getMissing_no(arr, start, end) {
    arr = arr.sort();
    var n = arr.length;


    for (var i = 0; i < n; i++) {

        let first_no = arr[i];

        let next_no = arr[i + 1];

        // Check first number missing
        if (start == arr[0] - 1) {
            return "First No " + start + " Missing"
        }
        // Return missing number
        if (next_no - first_no == 2) {

            return arr[i] + 1;
        }

        //Check last number missing
        if (end == arr[arr.length - 1] + 1) {
            return "Last No " + end + " Missing"
        }


    }

}

