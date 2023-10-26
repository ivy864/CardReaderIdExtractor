window.onload = function () {
    document.getElementById("entry").value = ""
}

function getIDs() {
    entryBox = document.getElementById("entry");

    lines = entryBox.value.split("\n");
    ids = [];
    for (i = 0; i < lines.length; i++) {
        id = lines[i].substring(50, 67);
        if (!!id) {
            ids.push(lines[i].substring(58, 67));
        }
    }

    resultDiv = document.getElementById("result");
    document.getElementById("numGenerated").innerText = `${lines.length} lines found, ${ids.length} IDs generated.`

    for (i = 0; i < ids.length; i++) {
        resultDiv.innerHTML += `<br>${ids[i]}`;
    }
}