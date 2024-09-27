const cards = Array.from(document.querySelectorAll(".card"));
const cardsContainer = document.querySelector("#cards");

cardsContainer.addEventListener("mousemove", (e) => {
  for (const cardNosotros of cards) {
    const rect = card.getBoundingClientRect();
    x = e.clientX - rect.left;
    y = e.clientY - rect.top;

    card.style.setProperty("--mouse-x", `${x}px`);
    card.style.setProperty("--mouse-y", `${y}px`);
  }
});

/****Redirige loader */
function showLoaderAndRedirect(url) {
  // Muestra el loader
  document.getElementById('loader').style.display = 'block';

  // Espera 3 segundos antes de redirigir
  setTimeout(function() {
    window.location.href = url; // Redirige a la URL proporcionada
  }, 3000);
}

