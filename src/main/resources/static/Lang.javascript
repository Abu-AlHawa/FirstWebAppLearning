const left = document.querySelector(".left");
const right = document.querySelector(".right");
const container = document.querySelector(".container");

left.addEventListener("mouse enter", () => {
  container.classList.add("hover-left");
});

left.addEventListener("mouse leave", () => {
  container.classList.remove("hover-left");
});

right.addEventListener("mouse enter", () => {
  container.classList.add("hover-right");
});

right.addEventListener("mouse leave", () => {
  container.classList.remove("hover-right");
});
