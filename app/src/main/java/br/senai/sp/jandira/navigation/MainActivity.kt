package br.senai.sp.jandira.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.navigation.screens.login.login.LoginScreen
import br.senai.sp.jandira.navigation.screens.login.menu.MenuScreen
import br.senai.sp.jandira.navigation.screens.login.pedidos.PerfilScreen
import br.senai.sp.jandira.navigation.screens.login.perfil.PedidosScreen
import br.senai.sp.jandira.navigation.ui.theme.NavigationTheme
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.animation.composable

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberAnimatedNavController()
                    AnimatedNavHost(
                        navController = navController,
                        startDestination = "login",
                        exitTransition = {
//                            slideOutOfContainer(
//                                AnimatedContentScope.SlideDirection.End,
//                                tween(1000)
//                            )
                            shrinkHorizontally(tween(2000)) + fadeOut(tween(5000)) +
                                    slideOutOfContainer(AnimatedContentScope.SlideDirection.Down,
                                        tween(2000)
                                    )
                        },
                        enterTransition = {
//                            scaleIn(tween(1000))
                            expandVertically(tween(2000))
                        }
                    ) {
                        composable(route = "login") { LoginScreen(navController)
                            AnimatedVisibility(
                                visible = true,
                                enter = fadeIn(),
                                exit = fadeOut()
                            ) {
                                LoginScreen(navController)
                            }
                        }
                        composable(route = "menu") { MenuScreen(navController) }
                        composable(route = "perfil") { PerfilScreen(navController) }
                        composable(route = "pedidos") { PedidosScreen(navController) }
                    }
                }
            }
        }
    }
}