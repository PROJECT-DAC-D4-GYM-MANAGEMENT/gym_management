import logo from './logo.svg';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import Signup from './pages/signup/signup';
import Signin from './pages/signin/signin';

function App() {
  return (
    <div className="App">
  
     <Routes>
      <Route path="/signup" element={<Signup/>}/>
      <Route path="/signin" element={<Signin/>}/>
     </Routes>
    </div>
  );
}

export default App;
