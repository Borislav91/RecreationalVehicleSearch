package com.borislav.recreationalvehiclesearchn.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.foundation.lazy.items
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.rememberAsyncImagePainter
import com.borislav.recreationalvehiclesearchn.domain.model.VehicleListing

private const val TAG = "OutdoorsyListingsScreen"

//This is the main screen of the app,
// where the OutdoorsyListingsViewModel is accessed and its state is observed.
@Composable
fun OutdoorsyListingsScreen() {
    val viewModel = hiltViewModel<OutdoorsyListingsViewModel>()
    val state by viewModel.state.collectAsStateWithLifecycle()

    OutdoorsyListingsContent(
        state = state,
        action = viewModel.submitAction
    )
}

// A composable function that lays out the content of the listings screen,
// including the search bar, loading indicator, error messages, and the list of RV listings.
@Composable
fun OutdoorsyListingsContent(
    state: OutdoorsyListingsState,
    action: (OutdoorsyListingsAction) -> Unit
) {
    Column {
        SearchBar { query ->
            action(OutdoorsyListingsAction.OnSearchRv(query))
        }
        if (state.isLoading) {
            // Display a loading indicator
            CircularProgressIndicator()
        } else if (state.error != null) {
            // Display error message
            Text("Error: ${state.error}")
        } else {
            state.searchResults?.let { ListingsColumn(it) }
        }
    }
}

// A user interface component that allows the user to enter search terms.
// It triggers a search action when the user submits a query.
@Composable
fun SearchBar(onSearch: (String) -> Unit) {
    var text by remember { mutableStateOf(TextFieldValue()) }

    BasicTextField(
        value = text,
        onValueChange = { text = it },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        singleLine = true,
        textStyle = TextStyle(color = Color.Black),
        decorationBox = { innerTextField ->
            Row(
                Modifier
                    .background(Color.LightGray, RectangleShape)
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(Icons.Filled.Search, contentDescription = "Search Icon")
                Spacer(Modifier.width(8.dp))
                innerTextField()
            }
        }
    )

    // Trigger search when the search button is clicked or enter is pressed
    LaunchedEffect(key1 = text) {
        onSearch(text.text)
    }
}

//Displays a list of RV listings in a scrollable column.
// Each item in the list is represented by the ListingItem composable.
@Composable
fun ListingsColumn(listings: List<VehicleListing>) {
    LazyColumn {
        items(listings) { listing ->
            ListingItem(listing)
        }
    }
}

//Represents a single RV listing. It displays an image and the name of the RV.
// The image is loaded using Coil's rememberAsyncImagePainter for seamless
// integration with Jetpack Compose.
@Composable
fun ListingItem(listing: VehicleListing) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .padding(10.dp)
                    .size(100.dp),
                painter = rememberAsyncImagePainter(listing.imageUrl),
                contentScale = ContentScale.FillBounds,
                contentDescription = null
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = listing.name ?: "",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
