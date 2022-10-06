# 1. As a User I should be able to register into the system
**Priority 1**

*Description:*

Users are able to create their accounts via email

*Requirements Registration form contains mandatory text fields:*

· First name

· Second name

· Email (email validation) (has email RegEx)

· Phone number (numbers 7-32)

· Password (4-20 chars)

Radio button Subscribe ("No" by default, not required) and checkbox "I have read and agree to the Privacy Policy"

*Acceptance criteria:*

After registration user is able to login into the system.

Highlights for testing:

Information from registration should be the same as in account page

# 2. As a user I should be able to access and manipulate with account

**Proirity 1**

*Description:*

After successful registration Users should have 'My Account' page with sub menu:

· My account

· Edit account

· Password

· Wish List

· Order History

· Downloads

· Returns

· Logout

· Newsletter

· Reward Points

· Recurring payments

· Transactions

*Requirements:*

'Edit account' menu item contains editable user info:

· First name

· Last name

· Email

· Phone number

'Address book' menu item - user is able to add many different addresses to use them in 'Order page'. New address page contains mandatory fields

· First name - text

· Second name – text

· Address - text

· City – text

· Post code - text

· Country - drop down list

· Region – drop down list

*Acceptance criteria:*

· User is able to see the submenus

· User is able to see and edit his/her personal information

· User is able to add new address

Highlights for testing:

Only one address could be default

# 3. As a registered user I should be able to add products to Wish List

**Priority 2**

*Description:*

As a registered user I am able to add to Wish List any product

*Acceptance criteria:*

· Wish List link should be present on the Top menu and show the count of items in the Wish List

· From Products List page there should be a link "Add to Wish List" with heart icon which add item to the Wish List

· From Product page there should be a link "Add to Wish List" with heart icon to add item to the Wish list

· Wish List should display all items added by the User

· In Wish List page there should be an options to remove item from the list by clicking "Remove" icon

· In Wish List page there should be an option to add this item to cart by clicking "Add to cart" icon

Highlights for testing:

For out of stock product use product - tablet "Space Tab 10.1"

# 4. As a user I should be able to manipulate within Shopping car

**Priority 1**

*Description:*

Available products could be added to shopping cart and all prices are calculated correctly

*Acceptance criteria:*

One product added to the cart and can be visible in cart with correct prices

Items with required fields can't be added to the shopping cart while all required fields are filled

Shopping cart should be visible in all pages on top menu and on menu on the right

Item count and prices should be displayed correctly on shopping cart button / link

It should be possibility increase / decrease product count in shopping cart

Prices should be calculated correctly on item list changes

Items That are out of stock - should be marked with and there should be notice in red " Products marked with are not available in the desired quantity or not in stock!"

Highlights for testing:

· For out of stock product use product Tablet : "Space Tab 10.1"

· For most required field product use Desktop: Appricot Cinema 30

# 5. As I user I should be able to checkout for purchasing completion
**Priority 1**

*Description:*

Checkout functionality should allow user to buy desired Products

*Acceptance criteria:*

In shopping cart page there should be link to Checkout

There should be direct link to Checkout on top menu

In shopping cart popup on right side should be link to Checkout

For non authorized users there should be page with guest checkout and ability to register and ability to login with existing account

During checkout process it is option to use existing address or add new one

It should be possibility to choose Payment method ( 1 currently)

Checkout process can't be finished without checking "I have read and agree to the Terms & Conditions"

Checkout page summary should have all correct information entered before

Checkout process shouldn't proceed with the out of stock items

Highlights for testing:

For out of stock product use product -tablet "Space Tab 10.1"

# 6. As I user I should be able to browse products within categories

**Priority 1**

*Description:*

All products should have own page and category

*Acceptance criteria:*

Each product should belong to 1 category and (not mandatory) belong to one subcategory

Categories should be present in all pages as drop-down menu with subcategories

Each subcategory button should contain count of available products

Categories list is available on left side of browse page

Browse page contains list of products from this category

List has sorting and pagination functionality

Products in list can be added to Wish List, Compare and Add to Cart

Highlights for testing:

N/A

# 7. As I user I should be able to search for desired products
**Priority 1**

*Description:*

User is able to search in product list

*Requirements:*

Search bar is displayed at all pages

Search by name regexp

Search in product descriptions

Search in subcategories

List of products after search can be sorted and have pagination

*Acceptance criteria:*

Search returns correct results and work from all pages

Highlights for testing:

Correct search for short search string:

· ‘Iph’ returns ‘Iphone’,

· ‘Ip’ returns ‘ipod’ and ‘iphone’

# 8. As I user I should have an option to view/compare/add to cart a product

**Priority 1**

*Description:*

Each product must have own product page

Product page contains information about product :

· name,

· description,

· specification,

· review,

· price,

· available options

and buttons ‘Compare’, “Add to Cart”, “Add to Wish list”

*Acceptance criteria:*

· User is able to open product page and add product to cart

· User is able to write review for product after purchase

· User is able to add product to compare list

· User is able to see image, price and specification

Highlights for testing:

N/A