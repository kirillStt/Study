const deleteBtn = document.getElementById("delete-btn");

const popup = document.getElementById("popup");

const noBtn = document.getElementById("no-btn");

const yesBtn = document.getElementById("yes-btn");

const success = document.getElementById("success");

const buyBtn = document.getElementById("buy-btn");

const overlay = document.getElementById("overlay");

deleteBtn.addEventListener("click", () => {
popup.style.display = "block";
overlay.classList.add("show");
});

noBtn.addEventListener("click", () => {
popup.style.display = "none";
overlay.classList.remove("show");
});

yesBtn.addEventListener("click", () => {
popup.style.display = "none";
success.style.display = "block";
overlay.classList.remove("show");
});

buyBtn.addEventListener("click", () => {
success.style.display = "none";
overlay.classList.remove("show");
});