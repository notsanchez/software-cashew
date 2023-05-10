import { StatusBar } from 'expo-status-bar';
import { useContext } from 'react';
import { Text, TouchableOpacity, View } from 'react-native';
import MainContext from '../../context/MainContext';

export default function LoginPage() {

    const { changeRoute } = useContext(MainContext);

    return (
        <>
            <View className="flex-1 items-center justify-center">
                <Text>Login</Text>
                <TouchableOpacity onPress={() => changeRoute('index')} className='px-4 py-2 font-bold text-lg bg-primary rounded-md'>Voltar</TouchableOpacity>
                <StatusBar style="auto" />
            </View>
        </>
    );
}