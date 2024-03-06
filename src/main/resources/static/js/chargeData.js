document.getElementById("showUserCourse").addEventListener("click", function() {
    fetch('/userCourse/listUserCourse')
        .then(response => response.text())
        .then(data => {
            document.getElementById('tableContainer').innerHTML = data;
        });
});

document.getElementById("showProgram").addEventListener("click", function() {
    fetch('/program/listProgram')
        .then(response => response.text())
        .then(data => {
            document.getElementById('tableContainer').innerHTML = data;
        });
});