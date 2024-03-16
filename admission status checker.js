function addOLevelDetails() {
            var index = document.getElementById("o-level-details-table").childElementCount + 1;
            var newRow = document.createElement("tr");
            newRow.innerHTML = `
                <td><input type="text" name="subject${index}" id="subject${index}" required></td>
                <td><input type="text" name="examScore${index}" id="examScore${index}" required></td>
                <td><button type="button" onclick="deleteOLevelDetails(${index})">Delete</button></td>
            `;
            document.getElementById("o-level-details-table").appendChild(newRow);
        }

        function deleteOLevelDetails(index) {
            var table = document.getElementById("o-level-details-table");
            table.removeChild(table.childNodes[index]);
            // Renumbering remaining inputs
            var rows = table.getElementsByTagName("tr");
            for (var i = index; i < rows.length; i++) {
                var inputs = rows[i].getElementsByTagName("input");
                inputs[0].setAttribute("name", `subject${i}`);
                inputs[0].setAttribute("id", `subject${i}`);
                inputs[1].setAttribute("name", `examScore${i}`);
                inputs[1].setAttribute("id", `examScore${i}`);
                var button = rows[i].getElementsByTagName("button")[0];
                button.setAttribute("onclick", `deleteOLevelDetails(${i})`);
            }
        }

        