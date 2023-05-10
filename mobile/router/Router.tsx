import { useContext } from 'react';
import MainContext from '../context/MainContext';
import LoginPage from '../screens/LoginPage/LoginPage';
import WelcomePage from '../screens/WelcomePage/WelcomePage';

export default function Router() {

    const { route } = useContext(MainContext);

    return (
        <>
            {route === 'index' && (
                <WelcomePage />
            )}
            {route === 'login' && (
                <LoginPage />
            )}
        </>
    );
}