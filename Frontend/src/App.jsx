import { Route, Routes } from 'react-router-dom'
import './App.css'
import Header from './pages/header/Header'
import Dashboard from './pages/dashboard/Dashboard'
import AddEmployee from './pages/employee/AddEmployee'
import NotFound from './pages/notFound/NotFound'
import UpdateEmployee from './pages/employee/UpdateEmployee'

function App() {

  return (
   <>
   <Header />
   <Routes>
    <Route path='/' element={<Dashboard />} />
    <Route path='/employee' element={<AddEmployee />} />
    <Route path='/employee/:id' element={<UpdateEmployee />} />
    <Route path='*' element={<NotFound />} />

   </Routes>
   </>
  )
}

export default App
