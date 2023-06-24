let catalogDogs = document.getElementById("main");
let dogs= [];

let dogsPromise = fetch('/api/dogs/', {
    method: 'GET',
  });
  dogsPromise.then((reponse) => {
    reponse.json().then(
      (prods) => {
        
        showCardsDogs(dogs);
      } //prods
    ) //json
      .catch((err) => {
        console.log("Error: " + err.message);
      }); //catch json
  } //response
  ) //then
    .catch((errorDOS) => {
		console.log("ERROR2")
      console.log("Error: " + errorDOS.message);
    });


function showCardsDogs(dogs) {

        allDogs = dogs.length;
        for (let i = 0; i < allDogs; i++) {
            let card = `
            <div class="card" style="width: 18rem;">
              <img src="${dogs[i].url}" class="card-img-top" alt="...">
              <div class="card-body">
                <h3 class="card-title">${dogs[i].dogName}</h3>
                <p class="card-text">${dogs[i].description}</p>
                <h5 class="card-title">${dogs[i].age}</h5>
              </div>
            </div>
            `;
            catalogDogs.insertAdjacentHTML("beforeend", card);
        }
    }
      