const questions = [
    { question: "Какой цвет имеет небо в ясный день?", answer: "голубой" },
    { question: "Сколько дней в неделе?", answer: "7" },
    { question: "Какой океан самый большой?", answer: "Тихий" },
    { question: "Кто написал 'Войну и мир'?", answer: "Толстой" },
    { question: "Какой элемент имеет химический символ 'O'?", answer: "Кислород" },
    { question: "Сколько планет в нашей солнечной системе?", answer: "8" },
    { question: "Кто был первым человеком на Луне?", answer: "Нил Армстронг" },
    { question: "Какой язык является официальным в Бразилии?", answer: "Португальский" },
    { question: "Что такое 'пикник'?", answer: "Ужин на природе" },
    { question: "Какой год начался 21 века?", answer: "2001" }
];

let currentQuestionIndex = 0;
let score = 0;

function displayQuestion() {
    const questionElement = document.getElementById('question');
    questionElement.innerText = questions[currentQuestionIndex].question;
}

function checkAnswer() {
    const answerElement = document.getElementById('answer');
    const userAnswer = answerElement.value.trim().toLowerCase();
    const correctAnswer = questions[currentQuestionIndex].answer.toLowerCase();

    if (userAnswer === correctAnswer) {
        score++;
    }

    currentQuestionIndex++;

    if (currentQuestionIndex < questions.length) {
        displayQuestion();
        answerElement.value = '';
    } else {
        showResult();
    }
}

function showResult() {
    const quizContainer = document.getElementById('quiz-container');
    quizContainer.innerHTML = `<h2>Викторина завершена!</h2>
                               <h3>Ваш результат: ${score} из ${questions.length}</h3>`;
}

document.getElementById('submit').addEventListener('click', checkAnswer);

window.onload = displayQuestion;
