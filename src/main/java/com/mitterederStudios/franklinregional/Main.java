package com.mitterederStudios.franklinregional;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    //Fragment managing the behaviors, interactions and presentation of the navigation drawer.
    private NavigationDrawerFragment mNavigationDrawerFragment;

     //Used to store the last screen title. For use in {@link #restoreActionBar()}.
    private CharSequence mTitle;

    //Global Vars
    boolean Nav_State_Changed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setProgressBarIndeterminateVisibility(true);
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title1);
                break;
            case 2:
                mTitle = getString(R.string.title2);
                break;
            case 3:
                mTitle = getString(R.string.title3);
                break;
            case 4:
                mTitle = getString(R.string.title4);
                break;
            case 5:
                mTitle = getString(R.string.title5);
                break;
            case 6:
                mTitle = getString(R.string.title6);
                break;
            case 7:
                mTitle = getString(R.string.title7);
                break;
            case 8:
                mTitle = getString(R.string.title8);
                break;
            case 9:
                mTitle = getString(R.string.title9);
                break;
            case 10:
                mTitle = getString(R.string.title10);
                break;
            case 11:
                mTitle = getString(R.string.title11);
                break;
            case 12:
                mTitle = getString(R.string.title12);
                break;
            case 13:
                mTitle = getString(R.string.title13);
                break;
            case 14:
                mTitle = getString(R.string.title14);
                break;
            case 15:
                mTitle = getString(R.string.title15);
                break;
            case 16:
                mTitle = getString(R.string.title16);
                break;
            case 17:
                mTitle = getString(R.string.title17);
                break;
            case 18:
                mTitle = getString(R.string.title18);
                break;
            case 19:
                mTitle = getString(R.string.title19);
                break;
            default:
                mTitle = getString(R.string.bug);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";
        private boolean Nav_State_Changed;

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.webpage_main, container, false);
            WebView web = (WebView) rootView.findViewById(R.id.mainWebPage);
            web.getSettings().setJavaScriptEnabled(true);
            web.getSettings().setBuiltInZoomControls(true);
            web.getSettings().setUseWideViewPort(true);
            web.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/20 Safari/537.31");
            web.setWebViewClient(new NewerWebViewClient());
            switch(getArguments().getInt(ARG_SECTION_NUMBER)){
                case 1:
                    web.loadUrl("http://www.franklinregional.k12.pa.us/");
                    return rootView;
                case 2:
                    web.loadUrl("http://franklinregionalshs.ss4.sharpschool.com/");
                    return rootView;
                case 3:
                    web.loadUrl("http://franklinregionalms.ss4.sharpschool.com/");
                    return rootView;
                case 4:
                    web.loadUrl("http://franklinregionalnes.ss4.sharpschool.com/");
                    return rootView;
                case 5:
                    web.loadUrl("http://franklinregionales.ss4.sharpschool.com/");
                    return rootView;
                case 6:
                    web.loadUrl("http://franklinregionalses.ss4.sharpschool.com/");
                    return rootView;
                case 7:
                    web.loadUrl("https://sme.iharriscomputer.com/schoolmax_franklin/reset.do?0uw3YEa.aU7zaju.xnn.xGOS6-Od-Od%2BS6_OG_OD.6F0gwUVm3sEVzWgkz13S6qOh6DSGD6F0_OgwEkeUs3uYAEEsaU7.LUazsrgjumkz13-SgsUWVjUVm3mWgwkmpwUVm31mLUjsegMmr3gYEjWekr3%3Dx");
                    return rootView;
                case 8:
                    web.loadUrl("http://wwww.franklinregional.wiueacdemy.org");
                    return rootView;
                case 9:
                    web.loadUrl("http://www.franklinregional.k12.pa.us/cms/one.aspx?portalId=76350&pageId=76372");
                    return rootView;
                case 10:
                    Nav_State_Changed = true;
                    reloadList(inflater, container, savedInstanceState);
                    return null;
            }
            return null;
        }

        private class NewerWebViewClient extends WebViewClient{
            @Override
            public boolean shouldOverrideUrlLoading(WebView webview, String url){
                webview.loadUrl(url);
                setProgressBarIndeterminateVisibility(true);
                return true;

            }
            @Override
            public void onPageFinished(WebView webview, String url){
                super.onPageFinished(webview, url);
                setProgressBarIndeterminateVisibility(false);
            }
        }

        private void reloadList(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            ListView mDrawerListView = (ListView) inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
            mDrawerListView.setAdapter(new ArrayAdapter<String>(
                    getActionBar().getThemedContext(),
                    android.R.layout.simple_list_item_1,
                    android.R.id.text1,
                    new String[]{
                            getString(R.string.title1),
                            getString(R.string.title2),
                            getString(R.string.title3),
                            getString(R.string.title4),
                            getString(R.string.bug),
                            getString(R.string.bug),
                            getString(R.string.title7),
                            getString(R.string.title8),
                            getString(R.string.title9),
                            getString(R.string.title10)

                    }));
        }

        private ActionBar getActionBar() {
            return ((ActionBarActivity) getActivity()).getSupportActionBar();
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((Main) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
