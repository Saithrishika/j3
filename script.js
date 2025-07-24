const form = document.getElementById('patientForm');
form.addEventListener('submit', async (e) => {
  e.preventDefault();
  const name = document.getElementById('name').value;
  const age = document.getElementById('age').value;
  const symptoms = document.getElementById('symptoms').value;

  const res = await fetch('http://localhost:8080/patient', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ name, age, symptoms })
  });

  const data = await res.text();
  document.getElementById('message').innerText = data;
  form.reset();
});
