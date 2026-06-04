console.log('Welcome to the Community Portal');

window.addEventListener('load', () => {
  alert('Page loaded successfully.');

  const savedType = localStorage.getItem('preferredEventType');
  const eventType = document.getElementById('eventType');
  if (savedType && eventType) {
    eventType.value = savedType;
  }

  const form = document.getElementById('eventForm');
  const clearBtn = document.getElementById('clearPrefs');
  const message = document.getElementById('formMessage');

  form.addEventListener('submit', (e) => {
    e.preventDefault();
    const selectedType = eventType.value;
    sessionStorage.setItem('lastEventType', selectedType);
    localStorage.setItem('preferredEventType', selectedType);
    message.textContent = `Registration confirmed for ${selectedType}!`;
    message.style.color = 'green';
  });

  clearBtn.addEventListener('click', () => {
    localStorage.removeItem('preferredEventType');
    sessionStorage.clear();
    eventType.value = 'Workshop';
    message.textContent = 'Preferences cleared.';
    message.style.color = 'red';
  });
});

function validatePhone(input) {
  const valid = /^\d{10}$/.test(input.value);
  alert(valid ? 'Phone number looks valid.' : 'Please enter a 10-digit phone number.');
}

function showFee(value) {
  document.getElementById('feeMessage').textContent = `Selected event fee: ${value}`;
}

function confirmAction() {
  alert('Confirmation received. Thank you for your feedback.');
}

function enlargeImage(image) {
  image.style.width = '320px';
  image.style.transition = 'width 0.3s ease';
}

function countFeedback(textarea) {
  document.getElementById('charCount').textContent = `Characters: ${textarea.value.length}`;
}

function showVideoReady() {
  document.getElementById('videoStatus').textContent = 'Video ready to play';
}

window.addEventListener('beforeunload', (event) => {
  event.preventDefault();
  event.returnValue = 'You have unsaved changes on this page. Are you sure you want to leave?';
});

const findNearby = document.getElementById('findNearby');
if (findNearby) {
  findNearby.addEventListener('click', () => {
    const geoOutput = document.getElementById('geoOutput');
    if (!navigator.geolocation) {
      geoOutput.textContent = 'Geolocation is not supported by this browser.';
      return;
    }

    navigator.geolocation.getCurrentPosition(
      (position) => {
        geoOutput.textContent = `Latitude: ${position.coords.latitude}, Longitude: ${position.coords.longitude}`;
      },
      (error) => {
        geoOutput.textContent = `Geolocation error: ${error.message}`;
      },
      { enableHighAccuracy: true, timeout: 10000 }
    );
  });
}
