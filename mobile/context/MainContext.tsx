import React, { createContext, useState } from 'react';

interface MainContextType {
    route: string;
    changeRoute: (value: string) => void;
}

const MainContext = createContext<MainContextType>({
    route: 'index',
    changeRoute: () => '',
});


export const MainContextProvider = ({ children }: any) => {
    const [route, setRoute] = useState('index');

    const changeRoute = (value: string) => {
        setRoute(value)
    }

    return (
      <MainContext.Provider value={{ route, changeRoute }}>
        {children}
      </MainContext.Provider>
    );
}


export default MainContext;
